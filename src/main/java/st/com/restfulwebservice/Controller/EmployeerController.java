package st.com.restfulwebservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import st.com.restfulwebservice.Model.Employeer;
import st.com.restfulwebservice.Service.EmployeerService;

import java.util.List;

@RestController
public class EmployeerController {
    @Autowired
    EmployeerService employeerService;

    @GetMapping("/employers")
    public List<Employeer> getEmployee(){
       return employeerService.getEmployeers();
    }
    @GetMapping("/employers/{name}")
    public Employeer getEmployee(@PathVariable("name") String name){
        return employeerService.getEmployer(name);
    }
    @PostMapping("/employers")
    public void createEmployee(@RequestBody Employeer employeer){
        employeerService.createEmployee(employeer);
    }
    @DeleteMapping("/employeers/{name}")
    public void deleteEmployee(@PathVariable("name")String name){
        employeerService.deleteEmployee(name);
    }

}
