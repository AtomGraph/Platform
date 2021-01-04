/**
 *  Copyright 2019 Martynas Jusevičius <martynas@atomgraph.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.atomgraph.linkeddatahub.server.exception;

import com.atomgraph.server.exception.ModelException;
import java.net.URI;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;

/**
 * Exception thrown when a write request attempts to construct a resource with a URI that already exists in the service dataset.
 * 
 * @author Martynas Jusevičius {@literal <martynas@atomgraph.com>}
 */
public class ResourceExistsException extends ModelException
{

    private final URI uri;
    private final Resource resource;

    public ResourceExistsException(URI uri, Resource resource, Model model)
    {
        super(model);
        this.uri = uri;
        this.resource = resource;
    }

    public URI getURI()
    {
        return uri;
    }
    
    public Resource getResource()
    {
        return resource;
    }

}