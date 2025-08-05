package com.alibaba.security.realidentity.service.track;

import com.alibaba.security.realidentity.biz.entity.ClientInfo;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class RPTrackHttpModel implements Serializable {
    public ClientInfo clientInfo;
    public String verifyToken;
    public List<TrackLog> wirelessLogs;
}
