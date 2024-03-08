import axios from "axios";

function Menu({ atualizarTabela }) {

  const refresh = () => {
    let time = new Date()
    time = time.getTime()
    const novosDados = time
    
    atualizarTabela(novosDados);
  };

  function abre(event) {
    const button = event.target.innerHTML

    switch (button) {
      case 'Adicionar aluno':
        document.getElementById('background').style.display = 'flex'
        document.getElementById('modalAdd').style.display = 'flex'
        break;
      case 'Editar aluno':
        document.getElementById('background').style.display = 'flex'
        document.getElementById('modalEdit').style.display = 'flex'
        break;
      case 'Deletar aluno':
        document.getElementById('background').style.display = 'flex'
        document.getElementById('modalDel').style.display = 'flex'
        break;

      default:
        break;
    }
  }

  function fecha() {
    document.getElementById('background').style.display = 'none'
    document.getElementById('modalAdd').style.display = 'none'
    document.getElementById('modalEdit').style.display = 'none'
    document.getElementById('modalDel').style.display = 'none'
  }

  function add() {
    const data = {
      id: document.getElementById('addId').value,
      name: document.getElementById('addName').value,
    };

    // Defina a URL do endpoint POST
    const apiUrl = 'http://localhost:8080/alunos';

    // Faça a solicitação POST usando Axios
    axios.post(apiUrl, data)
      .then(response => {
        // Manipule a resposta aqui
        console.log(response.data);
        refresh()
      })
      .catch(error => {
        // Manipule erros aqui
        console.error('Erro na solicitação:', error);
      });
  }

  function edit() {
    const data = {
      id: document.getElementById('editId').value,
      name: document.getElementById('editName').value,
    };

    // Defina a URL do endpoint POST
    const apiUrl = `http://localhost:8080/alunos/${data.id}`;

    // Faça a solicitação POST usando Axios
    axios.put(apiUrl, data)
      .then(response => {
        // Manipule a resposta aqui
        console.log(response.data);
        refresh()
      })
      .catch(error => {
        // Manipule erros aqui
        console.error('Erro na solicitação:', error);
      });
  }
  function del() {
    const data = {
      id: document.getElementById('delId').value,
    };

    // Defina a URL do endpoint POST
    const apiUrl = `http://localhost:8080/alunos/${data.id}`;

    // Faça a solicitação POST usando Axios
    axios.delete(apiUrl)
      .then(response => {
        // Manipule a resposta aqui
        console.log(response.data);
        refresh()
      })
      .catch(error => {
        // Manipule erros aqui
        console.error('Erro na solicitação:', error);
      });
  }

  return (
    <>
      <div className="menu">
        <button onClick={abre}>Adicionar aluno</button>
        <button onClick={abre}>Editar aluno</button>
        <button onClick={abre}>Deletar aluno</button>
      </div>
      <div className="background" id="background" onClick={fecha}></div>
      <div className="modal" id="modalAdd">
        <h1>Adicionar Aluno</h1>
        <input placeholder="id" id="addId" />
        <input placeholder="nome" id="addName" />
        <button onClick={add}>Confirmar</button>
      </div>
      <div className="modal" id="modalEdit">
        <h1>Adicionar Aluno</h1>
        <input placeholder="id" id="editId" />
        <input placeholder="nome" id="editName" />
        <button onClick={edit}>Confirmar</button>
      </div>
      <div className="modal" id="modalDel">
        <h1>Adicionar Aluno</h1>
        <input placeholder="id" id="delId" />
        <button onClick={del}>Confirmar</button>
      </div>
    </>
  )
}

export default Menu