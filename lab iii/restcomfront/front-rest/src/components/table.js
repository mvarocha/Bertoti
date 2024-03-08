import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Table({dados}) {

  const apiUrl = 'http://localhost:8080/alunos';

  const [data, setData] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get(apiUrl);
        setData(response.data);
      } catch (error) {
        console.error('Erro na requisição:', error);
      }
    };

    fetchData();
  }, [dados]);

  return (
    <table>
      <thead>
        <tr>
          <th>
            ID
          </th>
          <th>
            Aluno
          </th>
        </tr>
      </thead>
      <tbody>

        {data ? (
          data.map(aluno => (
            <tr key={aluno.id}>
              <td>{aluno.id}</td>
              <td>{aluno.name}</td>
            </tr>
          ))
        ) : (
          <tr>
            <td>Nada ainda</td>
          </tr>
        )}

      </tbody>

    </table>
  );
}

export default Table;
