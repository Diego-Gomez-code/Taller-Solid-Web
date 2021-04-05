package com.webDevelopment.solid.useCases;

import com.webDevelopment.solid.models.Book;
import com.webDevelopment.solid.services.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.webDevelopment.solid.SolidApplication.books;

import java.util.List;

@Service
public class DetailBook {

    @Autowired
    public DetailBook() {

    }

    public String execute(String book){
        String details = "";
        for(int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(book)) {
                details += books.get(i).bookDetails();
            }
        }
        return details;
    }
}