package com.taobao.browser.urlFilter;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.util.m;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.Activity.VideoPlayerActivity;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.Globals;
import com.taobao.tao.util.NetWorkUtils;
import com.taobao.tao.util.TBDialog;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class VideoFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-110034319);
    }

    public static /* synthetic */ void access$000(VideoFilter videoFilter, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c133dd", new Object[]{videoFilter, context, str});
        } else {
            videoFilter.startVideoActivity(context, str);
        }
    }

    public boolean videoFilter(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed52a87c", new Object[]{this, context, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (parse == null || parse.getHost() == null || !parse.getHost().equals(context.getString(R.string.video_url))) {
            return false;
        }
        BrowserUtil.a("VideoFilter", "videoFilter", null, str, null);
        m.c("VideoFilter", "video url:" + str);
        if (NetWorkUtils.isNetworkAvailable(context)) {
            startVideoActivity(context, str);
        } else {
            Toast.makeText(Globals.getApplication(), R.string.browser_network_err_tip, 0).show();
        }
        return true;
    }

    private void showVideoDialog(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89aad85", new Object[]{this, context, str});
            return;
        }
        final TBDialog tBDialog = new TBDialog((Activity) context, "流量提醒", "亲，您正在使用移动网络，是否继续？");
        tBDialog.setPositiveButton(new View.OnClickListener() { // from class: com.taobao.browser.urlFilter.VideoFilter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VideoFilter.access$000(VideoFilter.this, context, str);
                tBDialog.dismiss();
            }
        });
        tBDialog.setNegativeButton(new View.OnClickListener() { // from class: com.taobao.browser.urlFilter.VideoFilter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    tBDialog.dismiss();
                }
            }
        });
        tBDialog.show();
    }

    private void startVideoActivity(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1d6843", new Object[]{this, context, str});
        } else if (context == null) {
        } else {
            try {
                Intent intent = new Intent(context, VideoPlayerActivity.class);
                intent.putExtra("video_url", str);
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }
}
