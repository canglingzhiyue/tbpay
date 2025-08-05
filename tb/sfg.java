package tb;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/android/tucaoba/util/FeedbackManager;", "", "()V", "FEEDBACK_BIZ_CODE", "", "FEEDBACK_BIZ_TYPE", "KEY_FEEDBACK_CONTENT", "KEY_FEEDBACK_ID_TLOG", "KEY_FEEDBACK_TITLE", "reportFullstraceByTime", "", "context", "Landroid/content/Context;", "startTime", "", "endTime", "feedbackId", "title", "content", "tucaoba-android_debug"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class sfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b = "FEEDBACK";
    private final String c = "taobao4android_feedback_21646297";
    private final String d = "feedbackID";
    private final String e = "title";
    private final String f = "content";

    static {
        kge.a(-177250130);
    }

    public final void a(Context context, long j, long j2, String feedbackId, String title, String content) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0febe", new Object[]{this, context, new Long(j), new Long(j2), feedbackId, title, content});
            return;
        }
        q.d(context, "context");
        q.d(feedbackId, "feedbackId");
        q.d(title, "title");
        q.d(content, "content");
        try {
            Intent intent = new Intent("com.taobao.android.diagnose.action.feedback");
            intent.putExtra("feedbackID", feedbackId);
            intent.putExtra("title", title);
            intent.putExtra("content", content);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        olg.a(j, j2, this.b, this.c, ai.c(j.a(this.d, feedbackId), j.a(this.e, title), j.a(this.f, content)), null);
    }
}
