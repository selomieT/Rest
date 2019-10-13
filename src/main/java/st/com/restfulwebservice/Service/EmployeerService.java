package st.com.restfulwebservice.Service;

import org.springframework.stereotype.Service;
import st.com.restfulwebservice.Model.Employeer;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeerService {
    private static List<Employeer> employeers;

    static {
        initEmployeer();;
    }
    public static void initEmployeer(){
        employeers=new ArrayList<>();
        Employeer emp2=new Employeer("king",28);
        Employeer emp=new Employeer("Seli",28);
        Employeer emp1=new Employeer("Elsi",28);
        employeers.add(emp);
        employeers.add(emp1);
        employeers.add(emp2);
    }

    public void createEmployee(Employeer employeer){
        employeers.add(employeer);
    }

}
