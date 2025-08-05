package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/detail/rate/vivid/KTConstants;", "", "()V", "APPMONITOR_MODULE", "", "APPMONITOR_POINT", "DYNAMIC_MODLE_NAME_FEED", "getDYNAMIC_MODLE_NAME_FEED", "()Ljava/lang/String;", "DYNAMIC_MODLE_NAME_FEED_IMAGE_BIZID_ID", "", "getDYNAMIC_MODLE_NAME_FEED_IMAGE_BIZID_ID", "()I", "DYNAMIC_MODLE_NAME_FEED_IMAGE_BIZID_TYPE", "getDYNAMIC_MODLE_NAME_FEED_IMAGE_BIZID_TYPE", "GIF_MODE", "MUTE_MODE", "NORMAL_MODE", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPMONITOR_MODULE = "module_tb_rate_list";
    public static final String APPMONITOR_POINT = "monitor_tb_rate_list";
    public static final String GIF_MODE = "gif";
    public static final String MUTE_MODE = "mute";
    public static final String NORMAL_MODE = "normal";
    public static final kin INSTANCE = new kin();

    /* renamed from: a  reason: collision with root package name */
    private static final String f30101a = rif.TAG;
    private static final String b = "SwiftyRateKit";
    private static final int c = esr.EVALUATION;

    private kin() {
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : f30101a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : c;
    }
}
