
package EnterpriseJDBCServer;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.Remote;

@Remote
public interface DBSessionBeanRemote {

    String[] getHistory(String name);

    String[] getHistory(int code);

    boolean login(String user, String password);

    boolean logout();
}
