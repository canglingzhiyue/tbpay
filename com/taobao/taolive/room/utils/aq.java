package com.taobao.taolive.room.utils;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.phq;
import tb.pqi;

/* loaded from: classes8.dex */
public abstract class aq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(222509127);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            pqi.a().a("alive_interactive_count_action", str, 1.0d);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Map<String, Object> map) {
        com.taobao.tbliveinteractive.e p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c20ebe", new Object[]{aVar, str, map});
            return;
        }
        if (aVar == null) {
            aVar = n.a();
        }
        if (!(aVar instanceof phq) || (p = ((phq) aVar).p()) == null || p.h() == null) {
            return;
        }
        p.h().g(str, map);
    }

    public static boolean a(com.taobao.alilive.aliliveframework.frame.a aVar, ViewGroup viewGroup, String str, Map<String, String> map) {
        com.taobao.tbliveinteractive.e p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("744e4d63", new Object[]{aVar, viewGroup, str, map})).booleanValue();
        }
        if (aVar == null) {
            aVar = n.a();
        }
        if ((aVar instanceof phq) && (p = ((phq) aVar).p()) != null) {
            return p.b(viewGroup, str, map);
        }
        return false;
    }

    public static boolean b(com.taobao.alilive.aliliveframework.frame.a aVar, ViewGroup viewGroup, String str, Map<String, String> map) {
        com.taobao.tbliveinteractive.e p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4793424", new Object[]{aVar, viewGroup, str, map})).booleanValue();
        }
        if (aVar == null) {
            aVar = n.a();
        }
        if ((aVar instanceof phq) && (p = ((phq) aVar).p()) != null) {
            return p.a(viewGroup, str, map);
        }
        return false;
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Map<String, Object> map) {
        com.taobao.tbliveinteractive.e p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3de87f", new Object[]{aVar, str, map});
            return;
        }
        if (aVar == null) {
            aVar = n.a();
        }
        if (!(aVar instanceof phq) || (p = ((phq) aVar).p()) == null) {
            return;
        }
        p.a(str, map);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2) {
        com.taobao.tbliveinteractive.e p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79dfff1", new Object[]{aVar, str, str2});
            return;
        }
        if (aVar == null) {
            aVar = n.a();
        }
        if (!(aVar instanceof phq) || (p = ((phq) aVar).p()) == null) {
            return;
        }
        p.a(str, str2);
    }
}
