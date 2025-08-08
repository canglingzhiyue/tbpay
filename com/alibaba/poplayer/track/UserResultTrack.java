package com.alibaba.poplayer.track;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.bzl;
import tb.caa;
import tb.cab;
import tb.kge;

/* loaded from: classes3.dex */
public class UserResultTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_RESULT_CANCEL_ACTION = "CancelAction";
    public static final String USER_RESULT_CANCEL_ACTION_OLD = "Cancel";
    public static final String USER_RESULT_CLICK_ACTION = "ClickAction";
    public static final String USER_RESULT_CLICK_ACTION_OLD = "Click";
    public static final String USER_RESULT_EXPOSE = "Expose";
    public static final String USER_RESULT_EXPOSE_REAL = "ExposeReal";
    public static final String USER_RESULT_EXPOSE_STATE = "ExposeState";
    public static final String USER_RESULT_SCENE_ACTION = "SceneAction";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface UserResultAction {
    }

    static {
        kge.a(-308156495);
    }

    public static void a(PopRequest popRequest, String str, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd2e65a", new Object[]{popRequest, str, new Boolean(z), jSONObject});
        } else if (popRequest == null || StringUtils.isEmpty(str)) {
        } else {
            if (bzl.a().b().isUseNewActionLine()) {
                if ("Cancel".equals(str) || "Click".equals(str)) {
                    return;
                }
                b(popRequest, str, z, jSONObject);
                c.a("UserResultTrack.new.track.userAction=%s.trackInfo=%s", str, jSONObject);
            } else if (!"Expose".equals(str) && !"Cancel".equals(str) && !"Click".equals(str)) {
            } else {
                b(popRequest, str, z, jSONObject);
                c.a("UserResultTrack.old.track.userAction=%s.trackInfo=%s", str, jSONObject);
            }
        }
    }

    public static void a(d dVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25aab9c", new Object[]{dVar, jSONObject, new Boolean(z)});
            return;
        }
        cab.a(dVar.t(), z);
        if (dVar.I()) {
            caa.a("Expose", dVar.H(), dVar.G());
        } else {
            caa.a(dVar, "Expose", jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.alibaba.poplayer.layermanager.PopRequest r6, java.lang.String r7, boolean r8, com.alibaba.fastjson.JSONObject r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.poplayer.track.UserResultTrack.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r1[r3] = r7
            r6 = 2
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r8)
            r1[r6] = r7
            r6 = 3
            r1[r6] = r9
            java.lang.String r6 = "139559b"
            r0.ipc$dispatch(r6, r1)
            return
        L20:
            boolean r0 = android.text.StringUtils.isEmpty(r7)
            if (r0 != 0) goto La7
            boolean r0 = r6 instanceof com.alibaba.poplayer.trigger.d
            if (r0 == 0) goto La7
            com.alibaba.poplayer.track.module.OnePopModule r0 = r6.t()
            r0.aa = r7
            com.alibaba.poplayer.trigger.Event r0 = com.alibaba.poplayer.trigger.d.d(r6)
            if (r0 == 0) goto L4a
            tb.cai r0 = r0.getProcessCallBack()
            boolean r1 = r0 instanceof tb.fki
            if (r1 == 0) goto L4a
            tb.fki r0 = (tb.fki) r0
            r1 = r6
            com.alibaba.poplayer.trigger.d r1 = (com.alibaba.poplayer.trigger.d) r1
            java.lang.String r1 = r1.z()
            r0.a(r1, r7)
        L4a:
            boolean r0 = r6.I()
            com.alibaba.poplayer.track.module.OnePopModule r1 = r6.t()
            java.lang.String r4 = "ClickAction"
            boolean r4 = r4.equals(r7)
            java.lang.String r5 = "Click"
            if (r4 != 0) goto L8c
            boolean r4 = r5.equals(r7)
            if (r4 == 0) goto L63
            goto L8c
        L63:
            java.lang.String r4 = "CancelAction"
            boolean r4 = r4.equals(r7)
            java.lang.String r5 = "Cancel"
            if (r4 != 0) goto L73
            boolean r4 = r5.equals(r7)
            if (r4 == 0) goto L9d
        L73:
            tb.cab.c(r1, r8)
            java.lang.String r8 = r1.s
            boolean r8 = java.lang.Boolean.parseBoolean(r8)
            if (r8 == 0) goto L9d
            if (r0 == 0) goto L9d
            java.lang.String r8 = r6.H()
            com.alibaba.fastjson.JSONObject r1 = r6.G()
            tb.caa.a(r5, r8, r1)
            goto L9e
        L8c:
            tb.cab.b(r1, r8)
            if (r0 == 0) goto L9d
            java.lang.String r8 = r6.H()
            com.alibaba.fastjson.JSONObject r1 = r6.G()
            tb.caa.a(r5, r8, r1)
            goto L9e
        L9d:
            r3 = 0
        L9e:
            if (r3 != 0) goto La7
            if (r0 != 0) goto La7
            com.alibaba.poplayer.trigger.d r6 = (com.alibaba.poplayer.trigger.d) r6
            tb.caa.a(r6, r7, r9)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.track.UserResultTrack.b(com.alibaba.poplayer.layermanager.PopRequest, java.lang.String, boolean, com.alibaba.fastjson.JSONObject):void");
    }
}
