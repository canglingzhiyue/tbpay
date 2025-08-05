package tb;

import android.taobao.windvane.export.adapter.ILocalizationService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class fhx implements ILocalizationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1606069110);
        kge.a(-1422719030);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r11.equals(android.taobao.windvane.export.adapter.ILocalizationService.APP_LOAD_FAIL) != false) goto L16;
     */
    @Override // android.taobao.windvane.export.adapter.ILocalizationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fhx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r10
            r1[r3] = r11
            java.lang.String r11 = "9f352ae"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L18:
            r0 = 0
            if (r11 != 0) goto L1c
            return r0
        L1c:
            android.app.Application r1 = android.taobao.windvane.config.a.f
            if (r1 != 0) goto L21
            return r0
        L21:
            r5 = -1
            int r6 = r11.hashCode()
            r7 = 5
            r8 = 4
            r9 = 3
            switch(r6) {
                case -2108546188: goto L63;
                case -2108490769: goto L58;
                case -1875632439: goto L4d;
                case 693362: goto L42;
                case 979180: goto L37;
                case 666183601: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L6e
        L2d:
            java.lang.String r6 = "加载失败"
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L6e
            goto L6f
        L37:
            java.lang.String r2 = "确定"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L6e
            r2 = 5
            goto L6f
        L42:
            java.lang.String r2 = "取消"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L6e
            r2 = 4
            goto L6f
        L4d:
            java.lang.String r2 = "保存到相册"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L6e
            r2 = 3
            goto L6f
        L58:
            java.lang.String r2 = "图片保存到相册成功"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L6e
            r2 = 2
            goto L6f
        L63:
            java.lang.String r2 = "图片保存到相册失败"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L6e
            r2 = 1
            goto L6f
        L6e:
            r2 = -1
        L6f:
            if (r2 == 0) goto Lb3
            if (r2 == r3) goto La8
            if (r2 == r4) goto L9d
            if (r2 == r9) goto L92
            if (r2 == r8) goto L87
            if (r2 == r7) goto L7c
            return r0
        L7c:
            android.content.res.Resources r11 = r1.getResources()
            int r0 = com.taobao.taobao.R.string.app_confirm
            java.lang.String r11 = r11.getString(r0)
            return r11
        L87:
            android.content.res.Resources r11 = r1.getResources()
            int r0 = com.taobao.taobao.R.string.app_cancel
            java.lang.String r11 = r11.getString(r0)
            return r11
        L92:
            android.content.res.Resources r11 = r1.getResources()
            int r0 = com.taobao.taobao.R.string.app_save_to_album
            java.lang.String r11 = r11.getString(r0)
            return r11
        L9d:
            android.content.res.Resources r11 = r1.getResources()
            int r0 = com.taobao.taobao.R.string.app_image_saved_success
            java.lang.String r11 = r11.getString(r0)
            return r11
        La8:
            android.content.res.Resources r11 = r1.getResources()
            int r0 = com.taobao.taobao.R.string.app_image_saved_fail
            java.lang.String r11 = r11.getString(r0)
            return r11
        Lb3:
            android.content.res.Resources r11 = r1.getResources()
            int r0 = com.taobao.taobao.R.string.app_load_failed
            java.lang.String r11 = r11.getString(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fhx.a(java.lang.String):java.lang.String");
    }
}
