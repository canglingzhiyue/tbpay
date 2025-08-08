package anet.channel.assist;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import anet.channel.assist.oppo.OppoOperator;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AssistManager implements IAssistManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Map<String, String> SUPPORT_OPERATORS = new HashMap();
    private static final String TAG = "anet.AssistManager";
    private static IOperator operator;
    private boolean initialized = false;
    private Context mContext;

    public static /* synthetic */ void access$000(AssistManager assistManager, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc4fbbb", new Object[]{assistManager, context});
        } else {
            assistManager.doInitialize(context);
        }
    }

    @Override // anet.channel.assist.IAssistManager
    public void initialize(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else {
            WorkExecutor.submitTask(new Runnable() { // from class: anet.channel.assist.AssistManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context2 = context;
                    if (context2 == null) {
                        return;
                    }
                    AssistManager.access$000(AssistManager.this, context2);
                }
            });
        }
    }

    private void doInitialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764a5086", new Object[]{this, context});
        } else if (this.initialized) {
        } else {
            synchronized (this) {
                if (this.initialized) {
                    ALog.e(TAG, "already initialize.", null, new Object[0]);
                    return;
                }
                ALog.e(TAG, "initialize", null, new Object[0]);
                this.mContext = context;
                NetworkAssist.setContext(context);
                installSupportBrand();
                IOperator findOperator = findOperator();
                operator = findOperator;
                if (findOperator != null) {
                    operator.register(context);
                }
                this.initialized = true;
            }
        }
    }

    private void installSupportBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b823813a", new Object[]{this});
            return;
        }
        try {
            if (!ABGlobal.isFeatureOpened(this.mContext, "network_assist_oppo")) {
                return;
            }
            SUPPORT_OPERATORS.put("oppo", OppoOperator.class.getName());
        } catch (Throwable unused) {
            ALog.e(TAG, "[installSupportBrand]ABGlobal not support", null, new Object[0]);
        }
    }

    @Override // anet.channel.assist.IAssistManager
    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue() : this.initialized;
    }

    @Override // anet.channel.assist.IAssistManager
    public ICapability getCapability(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICapability) ipChange.ipc$dispatch("25bc8e05", new Object[]{this, new Integer(i)});
        }
        IOperator iOperator = operator;
        if (iOperator == null || !iOperator.isEnable()) {
            return NetworkAssist.DEFAULT_ABILITY;
        }
        return operator.getCapability(i);
    }

    private IOperator findOperator() {
        IOperator iOperator;
        String brand = getBrand();
        String str = SUPPORT_OPERATORS.get(brand);
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            iOperator = (IOperator) Class.forName(str).newInstance();
            try {
                ALog.e(TAG, "findOperator.", null, "brand", brand, "operator", iOperator);
            } catch (Exception e) {
                e = e;
                ALog.e(TAG, "findOperator, newInstance error.", null, e, new Object[0]);
                return iOperator;
            }
        } catch (Exception e2) {
            e = e2;
            iOperator = null;
        }
        return iOperator;
    }

    private String getBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935139c8", new Object[]{this});
        }
        String str = StringUtils.isEmpty(Build.BRAND) ? Build.MANUFACTURER : Build.BRAND;
        return str == null ? "" : str.toLowerCase();
    }
}
