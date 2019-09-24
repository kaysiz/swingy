package za.co.swingy.model.artifact;

import lombok.Getter;

import java.io.Serializable;

/**
 * Artifact
 * 
 * @author  Thapelo Masethe
 * @since   2019-07-04
 * @version 1.0
 */
@Getter
public abstract class Artifact implements Serializable {

    private static final long serialVersionUID = 2776303584447042497L;
    
    String name;
    ArtifactEnum type;

    /**
     * Artifact constructor: when creating
     * an artifact set {@code name} to the
     * given parameter.
     * 
     * @param name The name of the artifact.
     */
    Artifact(String name) {

        this.name = name;
    }
}