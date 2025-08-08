package com.taobao.taolive.taolivemorelive.morelive.ui;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.mfj;
import tb.pqo;

/* loaded from: classes8.dex */
public class MoreLiveFakeExposeCtrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ExposeData f21974a;

    /* loaded from: classes8.dex */
    public static class ExposeData implements Serializable {
        public long mLastRefreshTime = 0;
        public Set<Long> mExposeList = new HashSet();
    }

    /* loaded from: classes8.dex */
    public enum RefreshType {
        ENTER(1),
        TAB(2),
        MORE(3),
        PULL(4);
        
        int type;

        RefreshType(int i) {
            this.type = i;
        }

        int getType() {
            return this.type;
        }
    }

    public MoreLiveFakeExposeCtrl() {
        String a2 = pqo.a("KEY_FAKE_EXPOSE_MORE_LIVE");
        if (!StringUtils.isEmpty(a2)) {
            try {
                this.f21974a = (ExposeData) JSON.parseObject(a2, ExposeData.class);
            } catch (Exception unused) {
                this.f21974a = null;
            }
        }
        if (this.f21974a == null) {
            this.f21974a = new ExposeData();
        }
    }

    public JSONObject a(RefreshType refreshType, List<Long> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e2ad93", new Object[]{this, refreshType, list});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (0 == this.f21974a.mLastRefreshTime) {
            this.f21974a.mLastRefreshTime = currentTimeMillis;
        }
        long j = currentTimeMillis - this.f21974a.mLastRefreshTime;
        this.f21974a.mLastRefreshTime = currentTimeMillis;
        String a2 = a(list);
        String a3 = a(this.f21974a.mExposeList);
        this.f21974a.mExposeList.clear();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestInterval", (Object) Long.valueOf(j / 1000));
            jSONObject.put("requestExpoList", (Object) a2);
            if (RefreshType.MORE == refreshType) {
                jSONObject.put("loadMoreExposeList", (Object) a3);
            }
            jSONObject.put(i.CDN_REQUEST_TYPE, (Object) Integer.valueOf(refreshType.getType()));
            return jSONObject;
        } catch (Exception e) {
            mfj.a("FakeExpose", "to json exp.", e);
            return null;
        }
    }

    public JSONObject a(RefreshType refreshType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("37e368a2", new Object[]{this, refreshType}) : a(refreshType, new ArrayList(this.f21974a.mExposeList));
    }

    public void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
        } else if (l.longValue() <= 0) {
        } else {
            this.f21974a.mExposeList.add(l);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ExposeData exposeData = this.f21974a;
        if (exposeData == null) {
            return;
        }
        try {
            pqo.a("KEY_FAKE_EXPOSE_MORE_LIVE", JSON.toJSONString(exposeData));
        } catch (Exception unused) {
        }
    }

    private String a(Collection<Long> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2afc0da7", new Object[]{this, collection});
        }
        if (collection == null) {
            return "";
        }
        Iterator<Long> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(it.next());
            if (!it.hasNext()) {
                return sb.toString();
            }
            sb.append(',');
        }
    }
}
