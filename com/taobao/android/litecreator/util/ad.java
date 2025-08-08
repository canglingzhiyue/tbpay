package com.taobao.android.litecreator.util;

import android.graphics.Matrix;
import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class ad implements com.alibaba.marvel.java.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MAIN_PROJECT_ID = "";
    public static final int MARVEL_LOG_LEVEL_WARNING = 3;
    public static final String TAG = "UmiPublishTask_Marvel";

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ad f13483a;

        static {
            kge.a(2001589318);
            f13483a = new ad();
        }

        public static /* synthetic */ ad a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("70a44151", new Object[0]) : f13483a;
        }
    }

    static {
        kge.a(-645927062);
        kge.a(-1494616301);
    }

    public static ad a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("70a44151", new Object[0]) : a.a();
    }

    private ad() {
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int initSDK = Marvel.initSDK(Globals.getApplication());
        u.d(u.MODULE_NAME, "UmiPublishTask_Marvel, initMarvelSDK, resultCode=" + initSDK);
        Marvel.setTlogCallback(this);
        return initSDK;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : Marvel.isInit() || b() == 0;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Marvel.unInitSDK();
        u.d(u.MODULE_NAME, "unInitMarvelSdk: marvel ");
    }

    public void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
        } else if (i >= s.o()) {
            u.d(u.MODULE_NAME, "UmiPublishTask_Marvel, marvel tlog level: " + i + " ,module: " + str + " ,message: " + str2);
        } else {
            u.b(u.MODULE_NAME, "UmiPublishTask_Marvel, marvel log level: " + i + " ,module: " + str + " ,message: " + str2);
        }
    }

    public static void a(MeEditor meEditor, String str, String str2, Map<String, String> map, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ea1eae", new Object[]{meEditor, str, str2, map, str3, new Long(j)});
        } else {
            a(meEditor, str, str2, map, str3, 0L, j);
        }
    }

    public static void a(MeEditor meEditor, String str, String str2, Map<String, String> map, String str3, long j, long j2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655a2dd6", new Object[]{meEditor, str, str2, map, str3, new Long(j), new Long(j2)});
            return;
        }
        if (StringUtils.isEmpty(str2) || map == null) {
            z = false;
        }
        if (z) {
            meEditor.setSourceStartTimeUs(str, j);
            meEditor.setSourceEndTimeUs(str, j2);
            meEditor.changeClipRes(str, str3, map);
            return;
        }
        meEditor.changeClipRes(str, str3, j, j2);
    }

    public static List<String> a(MeEditor meEditor, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("16f1a507", new Object[]{meEditor, str, list});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        meEditor.selectProject(str);
        meEditor.getTrackIdList("", arrayList2);
        for (String str2 : arrayList2) {
            ArrayList<String> arrayList3 = new ArrayList();
            meEditor.getClipIdList(str2, arrayList3);
            for (String str3 : arrayList3) {
                if (list == null || !list.contains(meEditor.getClipType(str3))) {
                    arrayList.add(str3);
                }
            }
        }
        return arrayList;
    }

    public static List<String> a(MeEditor meEditor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1aeb9418", new Object[]{meEditor, str}) : a(meEditor, str, Arrays.asList("main"));
    }

    public static void a(MeEditor meEditor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcc4a55", new Object[]{meEditor, str, new Long(j)});
            return;
        }
        meEditor.selectProject("");
        meEditor.selectProject(str);
        for (String str2 : a(meEditor, str)) {
            meEditor.setSourceEndTimeUs(str2, j);
        }
        meEditor.selectProject("");
    }

    public static void b(MeEditor meEditor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a906fbd6", new Object[]{meEditor, str, new Long(j)});
        } else if (!StringUtils.equals(meEditor.getClipType(str), "subProject")) {
        } else {
            String property = meEditor.getCoreEditor().getProperty(str, "clip", "project_id", "");
            if (StringUtils.isEmpty(property)) {
                return;
            }
            a(meEditor, property, j);
        }
    }

    public static void a(MeEditor meEditor, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcc8665", new Object[]{meEditor, str, new Boolean(z)});
        } else if (StringUtils.equals(meEditor.getClipType(str), "subProject")) {
            String property = meEditor.getCoreEditor().getProperty(str, "clip", "project_id", "");
            if (StringUtils.isEmpty(property)) {
                return;
            }
            meEditor.selectProject("");
            meEditor.selectProject(property);
            for (String str2 : a(meEditor, property)) {
                meEditor.setClipVolume(str2, z ? 0.0f : 1.0f);
            }
            meEditor.selectProject("");
        }
    }

    public static boolean a(Paster paster, com.taobao.android.litecreator.sdk.editor.ao aoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecaa619a", new Object[]{paster, aoVar})).booleanValue();
        }
        if (paster != null && paster.extra != null && aoVar != null) {
            String str = (String) paster.extra;
            int C = aoVar.C();
            int H = aoVar.H();
            int displayWidth = aoVar.g().getDisplayWidth();
            int displayHeight = aoVar.g().getDisplayHeight();
            float f = C;
            float f2 = H;
            RectF rectF = new RectF(0.0f, 0.0f, f, f2);
            RectF rectF2 = new RectF(0.0f, 0.0f, displayWidth, displayHeight);
            float a2 = (int) (aoVar.a(str) * aoVar.C());
            float b = (int) (aoVar.b(str) * aoVar.H());
            RectF rectF3 = new RectF(0.0f, 0.0f, a2, b);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
            matrix.mapRect(rectF2);
            Matrix matrix2 = new Matrix();
            float f3 = a2 / 2.0f;
            float f4 = b / 2.0f;
            matrix2.postRotate(-paster.transform.rotate, f3, f4);
            matrix2.postTranslate(((paster.transform.postionX + 0.5f) * f) - f3, ((paster.transform.postionY + 0.5f) * f2) - f4);
            matrix2.mapRect(rectF3);
            if (!rectF3.isEmpty() && (rectF3.top < rectF2.top || rectF3.bottom > rectF2.bottom)) {
                return true;
            }
        }
        return false;
    }
}
