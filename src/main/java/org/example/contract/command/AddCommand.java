package org.example.contract.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.contract.model.ProductDTO;
@AllArgsConstructor
@Getter
public class AddCommand implements Command{
    private ProductDTO productDTO;
    private String login;
    private String password;
}
