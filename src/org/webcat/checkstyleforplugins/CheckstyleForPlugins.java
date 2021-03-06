/*==========================================================================*\
 |  Copyright (C) 2006-2018 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU Affero General Public License as published
 |  by the Free Software Foundation; either version 3 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU Affero General Public License
 |  along with Web-CAT; if not, see <http://www.gnu.org/licenses/>.
\*==========================================================================*/

package org.webcat.checkstyleforplugins;

import org.webcat.core.Subsystem;
import com.webobjects.foundation.*;

//-------------------------------------------------------------------------
/**
 *  This subsystem provides <a href="http://checkstyle.sf.net/">Checkstyle</a>
 *  for grading plug-ins.
 *
 *  @author  Stephen Edwards
 */
public class CheckstyleForPlugins
    extends Subsystem
{
   //~ Constructors ..........................................................

   // ----------------------------------------------------------
   /**
    * Creates a new CheckstyleForPlugins subsystem object.
    */
   public CheckstyleForPlugins()
   {
       super();
   }


   //~ Methods ...............................................................

   // ----------------------------------------------------------
   /**
    * Add any subsystem-specific plug-in property bindings
    * to the given dictionary.
    * @param properties the dictionary to add new properties to;
    * individual plug-in information may override these later.
    */
   public void addPluginPropertyBindings(
       NSMutableDictionary<String, String> properties)
   {
       // checkstyle.jar
       addFileBinding(
           properties,
           CHECKSTYLE_JAR_KEY,
           SUBSYSTEM_PREFIX + CHECKSTYLE_JAR_KEY,
           "checkstyle-all.jar");
   }


   //~ Instance/static variables .............................................

   private static final String SUBSYSTEM_PREFIX   = "CheckstyleForPlugins.";
   private static final String CHECKSTYLE_JAR_KEY = "checkstyle.jar";
}
