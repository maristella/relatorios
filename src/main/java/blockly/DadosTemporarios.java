package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DadosTemporarios {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// DadosTemporarios
	public static Var buscarAbastecimentos() throws Exception {
		return new Callable<Var>() {

			private Var abastecimentos = Var.VAR_NULL;
			private Var i = Var.VAR_NULL;

			public Var call() throws Exception {
				abastecimentos = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"),
						Var.valueOf("application/json"),
						Var.valueOf(
								"http://postousuario.cronapp.io/api/cronapi/query/listaAbastecimentos/17044E71-B5A7-41E2-991D-B4263A474087"),
						Var.VAR_NULL, Var.VAR_NULL);
				System.out.println(abastecimentos.getObjectAsString());
				for (Iterator it_i = abastecimentos.iterator(); it_i.hasNext();) {
					i = Var.valueOf(it_i.next());
					System.out.println(Var.valueOf("item ").getObjectAsString());
					System.out.println(i.getObjectAsString());
					System.out.println(cronapi.list.Operations.get(abastecimentos, i).getObjectAsString());
				} // end for
				return Var.VAR_NULL;
			}
		}.call();
	}

}
