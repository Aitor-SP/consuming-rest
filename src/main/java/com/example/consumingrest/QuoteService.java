package com.example.consumingrest;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

    //Lo inyecta directamente gracias a la dependencia Autowired
    RestTemplate restTemplate = new RestTemplate();

    public String getQuote() {
        Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
        return quote.getValue().getQuote();
    }
}
