package android.taobao.windvane.extra.uc;

import android.taobao.windvane.connect.HttpConnector;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class WVHeaderManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOGTAG = "WVHeaderManager";
    private static final String[] W3CHEADERS;
    private static volatile WVHeaderManager wvHeaderManager;
    private List<CustomRequestHeader> registerCustomHeadersList = new ArrayList();

    /* loaded from: classes.dex */
    public static class CustomRequestHeader {
        public Map<String, String> headers;
        public List<String> urls;

        static {
            kge.a(-98447830);
        }

        public CustomRequestHeader(List<String> list, Map<String, String> map) {
            if (list == null || map == null || list.isEmpty() || map.isEmpty()) {
                m.e(WVHeaderManager.LOGTAG, "HeaderOfURL: 初始化参数为空!");
                return;
            }
            this.urls = list;
            this.headers = map;
        }
    }

    static {
        kge.a(546509411);
        W3CHEADERS = new String[]{HttpRequest.HEADER_ACCEPT, "Accept-Charset", "Accept-Encoding", HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, "Accept-Ranges", "Authorization", HttpConstant.CACHE_CONTROL, "Connection", "Cookie", "Content-Length", "Content-Type", "Date", "Expect", "From", HttpConstant.HOST, "If-Match", HttpConnector.IF_MODIFY_SINCE, "If-None-Match", "If-Range", "If-Unmodified-Since", "Max-Forwards", "Pragma", "Proxy-Authorization", HttpConstant.RANGE, HttpConstant.REFERER, "TE", "Upgrade", HttpConstant.USER_AGENT, HttpConstant.VIA, "Warning"};
        wvHeaderManager = null;
    }

    private WVHeaderManager() {
    }

    public static WVHeaderManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVHeaderManager) ipChange.ipc$dispatch("51f53230", new Object[0]);
        }
        if (wvHeaderManager == null) {
            synchronized (WVHeaderManager.class) {
                if (wvHeaderManager == null) {
                    wvHeaderManager = new WVHeaderManager();
                }
            }
        }
        return wvHeaderManager;
    }

    public synchronized void registerCustomRequestHeader(CustomRequestHeader customRequestHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16b0eb4", new Object[]{this, customRequestHeader});
        } else if (customRequestHeader == null) {
            m.e(LOGTAG, "registerHeader: 注册对象为空!");
        } else {
            if (customRequestHeader.urls != null && !customRequestHeader.urls.isEmpty()) {
                if (customRequestHeader.headers != null && !customRequestHeader.headers.isEmpty()) {
                    this.registerCustomHeadersList.add(customRequestHeader);
                    return;
                }
                m.e(LOGTAG, "registerCustomRequestHeader: 添加的header为空!");
                return;
            }
            m.e(LOGTAG, "registerCustomRequestHeader: 添加的url为空!");
        }
    }

    public synchronized void unregisterCustomRequestHeader(CustomRequestHeader customRequestHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87afa3bb", new Object[]{this, customRequestHeader});
        } else if (customRequestHeader == null) {
            m.e(LOGTAG, "unregisterCustomRequestHeader: 注销对象为空!");
        } else {
            Iterator<CustomRequestHeader> it = this.registerCustomHeadersList.iterator();
            while (it.hasNext()) {
                if (it.next() == customRequestHeader) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public synchronized void addCustomRequestHeaderCheck(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4a5416", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            m.e(LOGTAG, "addHeaderCheck: 待添加的header为空");
        }
        if (StringUtils.isEmpty(str)) {
            m.e(LOGTAG, "addHeaderCheck: url为空!");
        } else if (this.registerCustomHeadersList == null || this.registerCustomHeadersList.isEmpty()) {
            m.b(LOGTAG, "addHeaderCheck: 配置的url组为空，不添加任何header");
        } else {
            try {
                String convertUrl = convertUrl(str);
                for (CustomRequestHeader customRequestHeader : this.registerCustomHeadersList) {
                    Iterator<String> it = customRequestHeader.urls.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (convertUrl.equals(it.next())) {
                            for (Map.Entry<String, String> entry : customRequestHeader.headers.entrySet()) {
                                if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(entry.getValue())) {
                                    if (map.containsKey(entry.getKey())) {
                                        m.e(LOGTAG, "addHeaderCheck: 重复添加header:" + entry.getKey());
                                    } else if (isInW3CHeaders(entry.getKey())) {
                                        m.e(LOGTAG, "addHeaderCheck: 添加W3C已存在的header:" + entry.getKey());
                                    } else {
                                        map.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                m.e(LOGTAG, "addHeaderCheck: 添加header为空!");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                m.e(LOGTAG, "addHeaderCheck: 发生异常!");
                e.printStackTrace();
            }
        }
    }

    public static boolean isInW3CHeaders(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e738dc3", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            m.e(LOGTAG, "isInW3CHeaders: 检测对象为空");
            return false;
        }
        for (String str2 : W3CHEADERS) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String convertUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("652ec3f3", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            m.e(LOGTAG, "convertUrl: 需转换的url为空!");
            return str;
        }
        int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
        if (indexOf != -1) {
            str = str.substring(indexOf + 3);
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '/' || str.charAt(i) == '?' || str.charAt(i) == '#') {
                return str.substring(0, i);
            }
        }
        return str;
    }
}
