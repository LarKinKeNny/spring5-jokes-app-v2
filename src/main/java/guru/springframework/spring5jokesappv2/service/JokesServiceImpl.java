package guru.springframework.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class JokesServiceImpl implements JokesService {

    private ChuckNorrisQuotes quotes;

    @PostConstruct
    private void init() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return quotes.getRandomQuote();
    }
}
