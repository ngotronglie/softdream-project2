package company.softdream.project.controller;


import company.softdream.project.dto.ApiResponse;
import company.softdream.project.entity.Role;
import company.softdream.project.repository.RoleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {


    private final RoleRepository roleRepository;

    public HomeController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping
    public ApiResponse<List<Role>> getAllRoles() {
        List<Role> roles = roleRepository.findAll();

        return new ApiResponse<>(
                "success",                   // status
                "Fetched roles successfully", // message
                roles,                      // data (list of roles)
                null                        // error (nếu có lỗi thì truyền ở đây)
        );
    }
}
