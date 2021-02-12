/*
 * This file is part of PCAPdroid.
 *
 * PCAPdroid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PCAPdroid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PCAPdroid.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2020 - Emanuele Faranda
 */

package com.emanuelef.remote_capture;

import java.io.Serializable;

public class VPNStats implements Serializable {
    int num_dropped_conns;
    int num_open_sockets;
    int max_fd;
    int active_conns;
    int tot_conns;
    int num_dns_queries;

    /* Invoked by native code */
    public void setData(int _num_dropped_conns, int _num_open_sockets, int _max_fd,
                        int _active_conns, int _tot_conns, int _num_dns_queries) {
        num_dropped_conns = _num_dropped_conns;
        num_open_sockets = _num_open_sockets;
        max_fd = _max_fd;
        active_conns = _active_conns;
        tot_conns = _tot_conns;
        num_dns_queries = _num_dns_queries;
    }
}