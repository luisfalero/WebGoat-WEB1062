package org.owasp.webgoat.plugin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author nbaars
 * @since 4/8/17.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Comment {
    private String user;
    private String dateTime;
    private String text;

    @Override
    public String toString() {
        return String.format("user = %s\ndateTime = %s\ntext = %s", user, dateTime, text);
    }
}

