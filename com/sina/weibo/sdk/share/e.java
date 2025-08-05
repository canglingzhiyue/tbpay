package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public final class e {
    public long D;

    static {
        kge.a(-1860740863);
    }

    public static void a(Activity activity, WeiboMultiMessage weiboMultiMessage) {
        if (activity != null && a((Context) activity, weiboMultiMessage)) {
            Bundle bundle = new Bundle();
            bundle.putInt("_weibo_command_type", 1);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            bundle.putString("_weibo_transaction", sb.toString());
            bundle.putAll(weiboMultiMessage.writeToBundle(bundle));
            Intent intent = new Intent(activity, ShareTransActivity.class);
            intent.putExtra("start_flag", 1001);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, 10001);
        }
    }

    private static boolean a(Context context, WeiboMultiMessage weiboMultiMessage) {
        if (weiboMultiMessage != null) {
            List<Object> b = b(weiboMultiMessage);
            if (weiboMultiMessage.superGroupObject == null || com.sina.weibo.sdk.b.a.d(context)) {
                return true;
            }
            if (a(b, weiboMultiMessage.superGroupObject)) {
                Toast.makeText(context, "微博版本过低，不支持超话分享", 0).show();
                return false;
            }
            weiboMultiMessage.superGroupObject = null;
            return true;
        }
        return true;
    }

    private static boolean a(List<Object> list, Object obj) {
        return list != null && !list.isEmpty() && obj != null && list.contains(obj) && list.size() == 1;
    }

    private static List<Object> b(WeiboMultiMessage weiboMultiMessage) {
        ArrayList arrayList = new ArrayList();
        if (weiboMultiMessage.textObject != null) {
            arrayList.add(weiboMultiMessage.textObject);
        }
        if (weiboMultiMessage.imageObject != null) {
            arrayList.add(weiboMultiMessage.imageObject);
        }
        if (weiboMultiMessage.mediaObject != null) {
            arrayList.add(weiboMultiMessage.mediaObject);
        }
        if (weiboMultiMessage.multiImageObject != null) {
            arrayList.add(weiboMultiMessage.multiImageObject);
        }
        if (weiboMultiMessage.videoSourceObject != null) {
            arrayList.add(weiboMultiMessage.videoSourceObject);
        }
        if (weiboMultiMessage.superGroupObject != null) {
            arrayList.add(weiboMultiMessage.superGroupObject);
        }
        return arrayList;
    }
}
