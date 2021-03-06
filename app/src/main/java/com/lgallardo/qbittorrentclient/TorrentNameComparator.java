/*
 *   Copyright (c) 2014-2015 Luis M. Gallardo D.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the GNU Lesser General Public License v3.0
 *   which accompanies this distribution, and is available at
 *   http://www.gnu.org/licenses/lgpl.html
 *
 */
package com.lgallardo.qbittorrentclient;

import java.util.Comparator;

public class TorrentNameComparator implements Comparator<Torrent> {

    boolean reversed = false;

    TorrentNameComparator(boolean reversed) {
        this.reversed = reversed;
    }

    @Override
    public int compare(Torrent t1, Torrent t2) {
        String name1 = t1.getName();
        String name2 = t2.getName();

        if (reversed) {
            // Descending order
            return name2.compareTo(name1);

        } else {
            // Ascending order
            return name1.compareTo(name2);
        }
    }


}
