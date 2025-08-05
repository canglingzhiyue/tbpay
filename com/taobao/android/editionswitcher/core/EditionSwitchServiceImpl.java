package com.taobao.android.editionswitcher.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import java.util.List;
import tb.ghj;
import tb.ghk;
import tb.ghl;
import tb.ghm;
import tb.gho;
import tb.ghp;
import tb.kge;

/* loaded from: classes.dex */
public class EditionSwitchServiceImpl implements ghm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2059972016);
        kge.a(-1513016684);
    }

    @Override // tb.ghm
    public void doChangeVersion(ghj ghjVar, gho ghoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08d196d", new Object[]{this, ghjVar, ghoVar});
        } else {
            b.a().a(ghjVar, ghoVar);
        }
    }

    public void updateVersionInfo(Context context, List<ghp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175e2215", new Object[]{this, context, list});
        } else {
            c.a().a(list);
        }
    }

    @Override // tb.ghm
    public void onVersionResponse(ghk ghkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11122667", new Object[]{this, ghkVar});
        } else {
            c.a().a(ghkVar);
        }
    }

    @Override // tb.ghm
    public boolean isSpecifyVersionCode(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e53791a3", new Object[]{this, str})).booleanValue() : c.a().b(str);
    }

    @Override // tb.ghm
    public void addChangeVersionListener(ghl ghlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e01175a7", new Object[]{this, ghlVar});
        } else {
            c.a().a(ghlVar);
        }
    }

    @Override // tb.ghm
    public void removeChangeVersionListener(ghl ghlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5ebe24", new Object[]{this, ghlVar});
        } else {
            c.a().b(ghlVar);
        }
    }

    public ghp queryByVersionCode(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ghp) ipChange.ipc$dispatch("159be8a0", new Object[]{this, str}) : c.a().a(str);
    }

    @Override // tb.ghm
    public ghp queryCurrentVersionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("8a4cb9db", new Object[]{this});
        }
        if (j.a("editionSwitchNotifyUcp", true)) {
            return c.a().b();
        }
        return null;
    }
}
