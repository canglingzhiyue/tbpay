package anet.channel.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class SchemeGuesser {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ConcurrentHashMap<String, String> guessSchemeMap = new ConcurrentHashMap<>();
    private boolean enabled = true;

    /* loaded from: classes.dex */
    public static class holder {
        public static SchemeGuesser instance;

        static {
            kge.a(1532393870);
            instance = new SchemeGuesser();
        }

        private holder() {
        }
    }

    static {
        kge.a(-863657214);
    }

    public static SchemeGuesser getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SchemeGuesser) ipChange.ipc$dispatch("9add3281", new Object[0]) : holder.instance;
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.enabled = z;
        }
    }

    public String guessScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0570c53", new Object[]{this, str});
        }
        if (!this.enabled) {
            return null;
        }
        String str2 = this.guessSchemeMap.get(str);
        if (str2 != null) {
            return str2;
        }
        this.guessSchemeMap.put(str, "https");
        return "https";
    }

    public void onSslFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34466cbc", new Object[]{this, str});
        } else {
            this.guessSchemeMap.put(str, "http");
        }
    }
}
