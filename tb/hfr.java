package tb;

import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.quickcomment.bean.QuickCommReport;
import java.util.List;

/* loaded from: classes5.dex */
public interface hfr {
    public static final String BOTTOM_INPUT_SCAN_ANIM = "https://img.alicdn.com/imgextra/i1/O1CN0144XD731UK8FJbG8b2_!!6000000002498-54-tps-420-108.apng";
    public static final String ENABLE_QUICK_COMMENT = "enableQuickComment";
    public static final String HIDE_QUICK_COMMENT_EVENT = "com.taobao.taolive.room.hideQuickCommentGuide";
    public static final String QUICK_COMMENT_GUIDE = "Comment_Guide";
    public static final String REPORT_QUICK_COMMENT = "reportQuickComment";
    public static final String SHOW_INPUT_EVENT = "com.taobao.taolive.room.showInputEventWithQuickComment";

    void a();

    void a(long j, String str);

    boolean b();

    List<String> c();

    QuickCommReport d();

    void e();
}
