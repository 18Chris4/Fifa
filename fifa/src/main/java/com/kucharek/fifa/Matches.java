package com.kucharek.fifa;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("matches")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Matches {
    @Id
    private String _id;
    private int match;
    private String team;
    private String opponent;
    private int ps1;
    private int ops1;
    private int pcs;
    private int goals;
    private int goalsop;
    private String date;
    private String hour;
    private String category;
}
