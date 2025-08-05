package anet.channel.session.dns;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.session.dns.NavigationHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.activity.LoadingChatActivity;
import com.taobao.tao.navigation.d;
import com.taobao.tao.navigation.e;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes2.dex */
public class DynamicComponentHandler implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RemoteFeatureQoS";
    private static DynamicComponentHandler instance;
    private NavigationHelper.IBlockingResourceListener blockingResourceListener = null;

    /* loaded from: classes2.dex */
    public interface ResourceScene {
        public static final int MESSAGE = 1;
        public static final int TAOPAI = 3;
        public static final int TRIVER = 2;
        public static final int UNKNWON = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface Definition {
        }
    }

    static {
        kge.a(1131319278);
        kge.a(-1821291970);
        instance = new DynamicComponentHandler();
    }

    public static void setupHomeTableMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331b8d4f", new Object[0]);
        } else {
            e.a(instance);
        }
    }

    public static void registerBlockingResourceListener(NavigationHelper.IBlockingResourceListener iBlockingResourceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6aab5c4", new Object[]{iBlockingResourceListener});
        } else {
            instance.blockingResourceListener = iBlockingResourceListener;
        }
    }

    public static void onNavigation(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce00a617", new Object[]{intent});
            return;
        }
        Uri data = intent.getData();
        String action = intent.getAction();
        ALog.e(TAG, "onNavigation: uri=" + data + ", action=" + action, null, new Object[0]);
        if (data == null) {
            return;
        }
        String uri = data.toString();
        if (TextUtils.isEmpty(uri) || instance.blockingResourceListener == null) {
            return;
        }
        if (isMessageURL(uri)) {
            ALog.e(TAG, "onNavigation: scene=MESSAGE", null, new Object[0]);
            instance.blockingResourceListener.onBlockingScene(1);
        } else if (isTRiverURL(uri)) {
            ALog.e(TAG, "onNavigation: scene=TRIVER", null, new Object[0]);
            instance.blockingResourceListener.onBlockingScene(2);
        } else if (isTaopaiURL(uri)) {
            ALog.e(TAG, "onNavigation: scene=TAOPAI", null, new Object[0]);
            instance.blockingResourceListener.onBlockingScene(3);
        } else {
            ALog.e(TAG, "onNavigation: scene=UNKNWON", null, new Object[0]);
            instance.blockingResourceListener.onBlockingScene(0);
        }
    }

    @Override // com.taobao.tao.navigation.d
    public void onTabChanged(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        ALog.e(TAG, "onTabChanged: index=" + i + ", tabName=" + str, null, new Object[0]);
    }

    private static boolean isMessageURL(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("306d3dc7", new Object[]{str})).booleanValue() : str.equals("taobao://message/root") || str.startsWith(LoadingChatActivity.LOAD_CHAT_URL) || (str.startsWith("http://tb.cn/") && str.contains("nav_source_id=agoo:"));
    }

    private static boolean isTRiverURL(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bad84922", new Object[]{str})).booleanValue() : str.startsWith("tbopen://m.taobao.com/tbopen/index.html?h5Url=https%3A%2F%2Fm.duanqu.com%2F%3F_ariver_appid%3D") || (str.startsWith("https://m.duanqu.com") && str.contains("_ariver_appid="));
    }

    private static boolean isTaopaiURL(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22075724", new Object[]{str})).booleanValue() : str.startsWith(UmiWvPlugin.NEW_RECORD_PATH) || str.startsWith("https://h5.m.taobao.com/litecreator/flat_record.html") || str.startsWith("https://h5.m.taobao.com/taopai/") || str.startsWith("https://h5.m.taobao.com/guangguang/index.htm");
    }
}
