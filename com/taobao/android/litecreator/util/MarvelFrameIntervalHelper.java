package com.taobao.android.litecreator.util;

import com.alibaba.marvel.Viewer;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes5.dex */
public class MarvelFrameIntervalHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_FRAME_INTERVAL_MS = 16;
    public static final int SCENE_IMAGE_EDIT = 2;
    public static final int SCENE_VIDEO_COVER_EDIT = 1;
    public static final int SCENE_VIDEO_EDIT = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface SceneType {
    }

    static {
        kge.a(1416933176);
    }

    public static boolean a(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0fea6c", new Object[]{new Float(f), new Float(f2)})).booleanValue() : f != -2.0f && f > f2;
    }

    public static void a(Viewer viewer, float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2cb5fcb", new Object[]{viewer, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        h.a("MarvelFrameIntervalHelper", "setHighFrameIfMetCondition, deviceScore = " + f + "，minHighFrameDeviceScore =" + f2);
        if (!a(f, f2)) {
            return;
        }
        a(viewer);
    }

    public static void a(Viewer viewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0969038", new Object[]{viewer});
        } else if (viewer == null) {
            h.a("MarvelFrameIntervalHelper", "setHighFrame, Viewer is null.");
        } else {
            viewer.setFrameInterval(16);
            h.a("MarvelFrameIntervalHelper", "setHighFrame, success");
        }
    }
}
