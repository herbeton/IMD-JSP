package aula06.encontro.modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaEncontros {
	private List <Encontro> encontros = new ArrayList();

    public void adicionar(Encontro e) {
          encontros.add(e);
    }

    public List<Encontro> listarEncontros() {
          return encontros;
    }
}
