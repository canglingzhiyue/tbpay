package com.taobao.taolive.room.service;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aa;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<i> f21687a = new ArrayList<>();
    private TppParamFeedInfo b = null;
    private int c = aa.M();

    static {
        kge.a(-1181593716);
    }

    public void a(TppParamFeedInfo tppParamFeedInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a15118", new Object[]{this, tppParamFeedInfo});
            return;
        }
        TppParamFeedInfo tppParamFeedInfo2 = this.b;
        if (tppParamFeedInfo2 != null && tppParamFeedInfo2.liveId != null) {
            i b = b(this.b.liveId);
            if (b == null) {
                b = new i(this.b.liveId);
                this.f21687a.add(b);
                if (this.f21687a.size() > this.c) {
                    this.f21687a.remove(0);
                }
            }
            b.b.add(this.b);
        }
        this.b = tppParamFeedInfo;
    }

    public ArrayList<TppParamFeedInfo> a() {
        TppParamFeedInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this});
        }
        ArrayList<TppParamFeedInfo> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f21687a.size(); i++) {
            i iVar = this.f21687a.get(i);
            if (iVar != null && (a2 = iVar.a()) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public ArrayList<TppParamFeedInfo> a(int i) {
        TppParamFeedInfo a2;
        TppParamFeedInfo a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b1219bf5", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            i = this.f21687a.size();
        }
        ArrayList<TppParamFeedInfo> arrayList = new ArrayList<>();
        int size = this.f21687a.size();
        if (i >= size) {
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = this.f21687a.get(i2);
                if (iVar != null && (a3 = iVar.a()) != null) {
                    arrayList.add(a3);
                }
            }
        } else {
            for (int i3 = size - i; i3 < size; i3++) {
                i iVar2 = this.f21687a.get(i3);
                if (iVar2 != null && (a2 = iVar2.a()) != null) {
                    arrayList.add(a2);
                }
            }
        }
        TppParamFeedInfo tppParamFeedInfo = this.b;
        if (tppParamFeedInfo != null) {
            if (tppParamFeedInfo.enter > 0) {
                this.b.stay = System.currentTimeMillis() - this.b.enter;
            }
            arrayList.add(this.b);
        }
        return arrayList;
    }

    public TppParamFeedInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TppParamFeedInfo) ipChange.ipc$dispatch("e131f514", new Object[]{this, str});
        }
        TppParamFeedInfo tppParamFeedInfo = this.b;
        if (tppParamFeedInfo != null && TextUtils.equals(str, tppParamFeedInfo.liveId)) {
            return this.b;
        }
        i b = b(str);
        if (b != null && !b.b.isEmpty()) {
            return b.b.get(b.b.size() - 1);
        }
        return null;
    }

    private i b(String str) {
        ArrayList<i> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("478da755", new Object[]{this, str});
        }
        if (str != null && (arrayList = this.f21687a) != null && arrayList.size() > 0) {
            for (int size = this.f21687a.size() - 1; size >= 0; size--) {
                i iVar = this.f21687a.get(size);
                if (iVar.f21688a != null && iVar.f21688a.equals(str)) {
                    return iVar;
                }
            }
        }
        return null;
    }
}
