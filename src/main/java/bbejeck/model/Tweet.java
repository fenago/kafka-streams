

package bbejeck.model;

/**

 * Date: 4/21/16
 * Time: 8:38 PM
 */
public class Tweet {

    private String id;
    private String text;
    private String language;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public String toString() {
        return "Tweet{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
