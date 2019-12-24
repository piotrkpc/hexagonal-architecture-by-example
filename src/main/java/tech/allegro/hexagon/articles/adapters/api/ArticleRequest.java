package tech.allegro.hexagon.articles.adapters.api;

import tech.allegro.hexagon.articles.domain.model.AuthorId;
import tech.allegro.hexagon.articles.domain.model.Content;
import tech.allegro.hexagon.articles.domain.model.Title;
import com.fasterxml.jackson.annotation.JsonProperty;

class ArticleRequest {
    private final String title;
    private final String content;
    private final String authorId;

    ArticleRequest(@JsonProperty("title") final String title, @JsonProperty("content") final String content, @JsonProperty("authorId") final String authorId) {
        this.title = title;
        this.content = content;
        this.authorId = authorId;
    }


    public Title title() {
        return Title.of(title);
    }

    public Content content() {
        return Content.of(content);
    }

    public AuthorId authorId() {
        return AuthorId.of(authorId);
    }

}
