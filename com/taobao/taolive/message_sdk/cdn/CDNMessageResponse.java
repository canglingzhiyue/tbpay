package com.taobao.taolive.message_sdk.cdn;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public class CDNMessageResponse implements INetDataObject {
    public int colorRate;
    public int dataSize;
    public long endTime;
    public ArrayList<CDNMessage> payloads;
    public int pullInterval;
    public String pullPolicy;
    public long startTime;
    public Map<Integer, Integer> subTypeColorRate;
}
