package com.taobao.android.litecreator.base.workflow;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.workflow.annotation.WorkflowNode;
import com.taobao.android.litecreator.util.u;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.io.Serializable;
import tb.gwu;
import tb.hfj;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FORWARD_REQUEST_CODE = 199;
    public static final String KEY_BOTH_WAY_FLAG = "BOTH_WAY_WORKFLOW_NODE";

    static {
        kge.a(-1135461340);
    }

    public static <T extends IWorkflowData> boolean a(c<T> cVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff58f6ab", new Object[]{cVar, intent})).booleanValue();
        }
        boolean d = d(cVar, intent);
        if (!d && (cVar instanceof Activity)) {
            hfj.a(((Activity) cVar).getApplication(), com.alibaba.ability.localization.b.a(R.string.gg_pub_data_exception_retry));
            u.d("LifecycleHooker", b(cVar) + ":isInterruptActivityOnCreate invalid data. plz check.");
        }
        return !d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends IWorkflowData> boolean d(c<T> cVar, Intent intent) {
        WorkflowNode workflowNode = (WorkflowNode) cVar.getClass().getAnnotation(WorkflowNode.class);
        if (workflowNode == null) {
            return true;
        }
        String checkerClassName = workflowNode.checkerClassName();
        if (!TextUtils.isEmpty(checkerClassName)) {
            try {
                return ((gwu) Class.forName(checkerClassName).newInstance()).check((IWorkflowData) intent.getSerializableExtra(IWorkflowData.KEY));
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static <T extends IWorkflowData> void b(c<T> cVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277528", new Object[]{cVar, intent});
        } else if (intent == null) {
        } else {
            u.b("LifecycleHooker", b(cVar) + ":in.");
            cVar.in((IWorkflowData) intent.getSerializableExtra(IWorkflowData.KEY));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.taobao.android.litecreator.base.workflow.IWorkflowData, java.io.Serializable] */
    public static int a(c<?> cVar, Intent intent, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("215fb20b", new Object[]{cVar, intent, new Integer(i), bundle})).intValue();
        }
        ResolveInfo resolveActivity = Globals.getApplication().getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null && resolveActivity.activityInfo != null) {
            Class<?> cls = null;
            try {
                String stringExtra = intent.getStringExtra("std_pop_origin_component_cls_name");
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = resolveActivity.activityInfo.name;
                }
                cls = Class.forName(stringExtra);
            } catch (Throwable unused) {
            }
            boolean z = cls != null;
            if (z) {
                intent.putExtra(IWorkflowData.KEY, (Serializable) cVar.mo1569out());
            }
            boolean a2 = a(intent, cls);
            if (z) {
                u.b("LifecycleHooker", b(cVar) + ":out (startActivity)." + cls.getSimpleName() + ".isBothWayNode:" + a2);
            } else {
                u.b("LifecycleHooker", b(cVar) + ":out (startActivity).");
            }
            if (i == -1 && a2) {
                return 199;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.litecreator.base.workflow.IWorkflowData, java.io.Serializable] */
    public static void a(c<?> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861b0cea", new Object[]{cVar});
        } else if (!(cVar instanceof Activity)) {
        } else {
            Activity activity = (Activity) cVar;
            if (!a(activity.getIntent(), cVar.getClass())) {
                return;
            }
            u.b("LifecycleHooker", b(cVar) + ":out (finish).");
            Intent intent = new Intent();
            intent.putExtra(IWorkflowData.KEY, (Serializable) cVar.mo1569out());
            activity.setResult(199, intent);
        }
    }

    public static <T extends IWorkflowData> void c(c<T> cVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f3a9", new Object[]{cVar, intent});
            return;
        }
        IWorkflowData iWorkflowData = (IWorkflowData) intent.getSerializableExtra(IWorkflowData.KEY);
        if (iWorkflowData == null) {
            return;
        }
        u.b("LifecycleHooker", b(cVar) + ":update (newIntent).");
        cVar.update(iWorkflowData);
    }

    public static <T extends IWorkflowData> void a(c<T> cVar, int i, int i2, Intent intent) {
        IWorkflowData iWorkflowData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c42487", new Object[]{cVar, new Integer(i), new Integer(i2), intent});
        } else if (intent == null || (iWorkflowData = (IWorkflowData) intent.getSerializableExtra(IWorkflowData.KEY)) == null) {
        } else {
            u.b("LifecycleHooker", b(cVar) + ":update (onActivityResult).");
            cVar.update(iWorkflowData);
        }
    }

    private static boolean a(Intent intent, Class<?> cls) {
        if (cls == null) {
            return true;
        }
        if (intent != null && intent.getExtras() != null && intent.getExtras().getBoolean(KEY_BOTH_WAY_FLAG, false)) {
            return true;
        }
        WorkflowNode workflowNode = (WorkflowNode) cls.getAnnotation(WorkflowNode.class);
        if (workflowNode == null) {
            return false;
        }
        String bothWayJudge = workflowNode.bothWayJudge();
        if (!TextUtils.isEmpty(bothWayJudge)) {
            try {
                return ((IBothWayJudge) Class.forName(bothWayJudge).newInstance()).isBothWayNode(intent);
            } catch (Throwable unused) {
                return workflowNode.bothWay();
            }
        }
        return workflowNode.bothWay();
    }

    private static String b(c<?> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19517995", new Object[]{cVar});
        }
        return cVar.getClass().getSimpleName() + riy.BRACKET_START_STR + cVar.hashCode() + riy.BRACKET_END_STR;
    }
}
