package st.com.restfulwebservice.Service;

import org.springframework.stereotype.Service;
import st.com.restfulwebservice.Model.Employeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public List<Employeer> getEmployeers(){
        return employeers;
    }
    public Employeer getEmployer(String name){
        Optional<Employeer>employeer=employeers.stream().filter(s->s.getName().equals(name)).findAny();
        return employeer.orElse(null);
    }
    public void updateEmployee(String name,Employeer employeer){
        for(int i=0;i<employeers.size();i++){
            if(employeers.get(i).getName().equals(name)){
                employeers.set(i,employeer);
            }
        }


    }
    public void deleteEmployee(String name){

       Employeer employeer=null;
       for(Employeer emp:employeers){
           if(emp.getName().equals(name)){
               employeer=emp;
           }
       }
       employeers.remove(employeer);
    }


}
