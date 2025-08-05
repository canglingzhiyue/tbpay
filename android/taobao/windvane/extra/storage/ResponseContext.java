package android.taobao.windvane.extra.storage;

import android.taobao.windvane.config.j;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ResponseContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String html;
    private int htmlLength;
    private String url;
    private boolean enable = false;
    private String rule = "";
    private String version = "0";
    private long expiredTime = 0;
    private int priority = 0;

    static {
        kge.a(-1908097993);
    }

    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue() : this.enable;
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.enable = z;
        }
    }

    public String getRule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2b8aac7", new Object[]{this});
        }
        String str = this.rule;
        return str == null ? "" : str;
    }

    public void setRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8dbee8f", new Object[]{this, str});
        } else {
            this.rule = str;
        }
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        String str = this.version;
        return str == null ? "0" : str;
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public long getExpiredTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da9b90d7", new Object[]{this})).longValue() : this.expiredTime;
    }

    public void setExpiredTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd3974d", new Object[]{this, new Long(j)});
        } else {
            this.expiredTime = j;
        }
    }

    public String getHtml() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4adcd78", new Object[]{this});
        }
        String str = this.html;
        return str == null ? "" : str;
    }

    public void setHtml(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658b21fe", new Object[]{this, str});
            return;
        }
        this.html = str;
        if (str == null) {
            return;
        }
        this.htmlLength = str.length();
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.html == null ? "" : this.url;
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public boolean isExpired() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue() : System.currentTimeMillis() > this.expiredTime;
    }

    public int getHtmlLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97213361", new Object[]{this})).intValue() : this.htmlLength;
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue() : this.priority;
    }

    public void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.priority = i;
    }

    public static long getDefaultExpiredTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f5a9ad82", new Object[0])).longValue() : System.currentTimeMillis() + (j.commonConfig.dc * 24 * 60 * 60 * 1000);
    }
}
