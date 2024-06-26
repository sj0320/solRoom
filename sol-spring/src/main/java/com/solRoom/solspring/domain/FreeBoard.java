package com.solRoom.solspring.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "longblob")
    private String content; // 이미지 파일을 저장할 byte 배열

    private int viewCount=0;

    private int likeCount=0;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="memberId")
    private Member member;

    @OneToMany(mappedBy = "board",fetch = FetchType.EAGER)
    private List<FreeBoardReply> reply;

    @CreationTimestamp
    private Timestamp createDate;

}
