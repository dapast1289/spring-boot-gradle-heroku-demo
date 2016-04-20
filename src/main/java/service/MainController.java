package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    String hello() {

        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS customers(" +
                "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");

        Integer v = jdbcTemplate.query(
                "SELECT 2+2 as res",
                new Object[] { },
                (rs, rowNum) -> new Integer(rs.getInt("res"))
        ).get(0);

        return "hello world " + v;
    }
}
