package com.aem.trg.microsoft.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Hero_bannerModel {

    @ValueMapValue
    private String label1;

    public String getLabel1() {
        return label1;
    }

    /**
 * Checks if all fields in this model are empty.
 * Used in HTL: ${!model.empty}
 */
    public boolean isEmpty() {
        boolean empty = true;
        if (label1 != null && !label1.isEmpty()) empty = false;
        return empty;
    }
}