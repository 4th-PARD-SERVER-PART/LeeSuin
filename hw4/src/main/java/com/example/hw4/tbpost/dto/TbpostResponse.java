package com.example.hw4.tbpost.dto;

import com.example.hw4.tbpost.entity.Tbpost;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class TbpostResponse {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TbpostReadResponse{
        private Long tbpostId;
        private String title;
        private String content;

        public static List<TbpostReadResponse> tbpostToDto(List<Tbpost> tbposts){
            List<TbpostReadResponse> ret = new ArrayList<>();
            for(Tbpost tbpost : tbposts){
                TbpostReadResponse b =
                        new TbpostReadResponse(tbpost.getId(), tbpost.getTitle(), tbpost.getContent());
                ret.add(b);
            }
            return ret;
        }
    }
}
