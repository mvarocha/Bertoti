import { useState } from 'react';
import './App.css';
import Menu from './components/menu';
import Table from './components/table';

function App() {
  const [dados, setDados] = useState([]); // O estado que será compartilhado

  const atualizarTabela = (novosDados) => {
    setDados(novosDados);
  };

  return (
    <div className="App">
      <Menu atualizarTabela={atualizarTabela}/>
      <Table dados={dados}/>
    </div>
  );
}

export default App;
