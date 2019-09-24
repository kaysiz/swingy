package za.co.swingy.model.artifact;

import lombok.Getter;

/**
 * Helm
 * 
 * @author  Thapelo Masethe
 * @since   2019-07-04
 * @see     za.wtc.swingy.model.artifact.Artifact
 * @version 1.0
 */
@Getter
public class Helm extends Artifact {

    private int hitPoints;

    /**
     * Helm constructor: since Helm extends
     * Artifact class, the Artifact constructor
     * with macthing parameter {@code name} will be
     * called. Set the {@code type} to "HELM" and
     * {@code hitPoints} to the parameter.
     * 
     * @param name The name of the Artifact.
     * @param hitPoints The helm's boost.
     */
    public Helm(String name, int hitPoints) {
        super(name);
        this.type = ArtifactEnum.HELM;
        this.hitPoints = hitPoints;
    }
}