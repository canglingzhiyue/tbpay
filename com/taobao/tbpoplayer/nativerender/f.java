package com.taobao.tbpoplayer.nativerender;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.e;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class f implements e.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(406744421);
        kge.a(-1213528176);
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public View a(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("85c77a10", new Object[]{this, stateModel, stateVersionModel});
        }
        return null;
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a42395", new Object[]{this, componentBaseModel, str, actionModel, list});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb765981", new Object[]{this, jVar});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2, boolean z, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae22edf1", new Object[]{this, str, str2, new Boolean(z), jVar});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public boolean a(List<String> list, List<String> list2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("633e544e", new Object[]{this, list, list2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : str;
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }
}
