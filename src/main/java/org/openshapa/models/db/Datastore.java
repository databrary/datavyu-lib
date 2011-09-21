/*
 * Copyright (c) 2011 OpenSHAPA Foundation, http://openshapa.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.openshapa.models.db;

import java.util.List;

/**
 * An interface which abstracts away from the specific underlying database,
 * with methods to access columns and cells in an intuitive manner.
 */
public interface Datastore {

    /**
     * @return All the variables held in the datastore.
     */
    List<Variable> getAllVariables();

    /**
     * @return The variables selected in the datastore.
     */
    List<Variable> getSelectedVariables();

    /**
     * @param varName The name of the variable to fetch.
     *
     * @return The variable that matches varName, NULL if unable to find a
     * variable that matches varName.
     */
    Variable getVariable(String varName);

    /**
     * Adds a variable to the datastore.
     *
     * @param var The new variable to add to the datastore.
     */
    void addVariable(final Variable var);

    /**
     * @return The name of the datastore.
     */
    String getName();

    /**
     * Sets the name of the datastore.
     *
     * @param datastoreName The new name to use for the datastore.
     */
    void setName(final String datastoreName);
}
