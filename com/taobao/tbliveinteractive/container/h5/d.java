package com.taobao.tbliveinteractive.container.h5;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1993164291);
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : pmd.a().d().a("tblive", "taoliveWebLayerInjectJSArray", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : pmd.a().d().a("tblive", "taoliveWebLayerOnStartInjectJSArray", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Boolean.parseBoolean(pmd.a().d().a("tblive", "taoliveWebLayerInjectJSEnable", "false"));
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : d() ? String.format("; window.domloadstart_taolivejscriptarray = %s;; window.domloadend_taolivejscriptarray = %s;;\n(function () {\n    function onDOMReady(callback) {\n        var list = window.domloadend_taolivejscriptarray\n        var readyRE = /complete|loaded|interactive/;\n        if (readyRE.test(document.readyState)) {\n            setTimeout(function () {\n                callback(list);\n            }, 1);\n        } else {\n            document.defaultView.addEventListener('DOMContentLoaded', function () {\n                callback(list);\n            }, false);\n        }\n    }\n    function loadScript(list) {\n        var jsArray = list;\n        for (var i in jsArray) {\n            var jsSrc = jsArray[i];\n            if (jsSrc && /^([\\w.+-]+:)(?:\\/\\/(?:[^\\/?#]*@|)([^\\/?#:]*)(?::(\\d+)|)|)/.test(jsSrc)) {\n                var script, head = document.head || document.documentElement;\n                script = document.createElement(\"script\");\n                script.async = true;\n                script.charset = \"UTF-8\";\n                script.src = jsSrc;\n                head.insertBefore(script, head.firstChild);\n            };\n        }\n    }\n\n    onDOMReady(loadScript);\n    async function downloadAndExecuteJS(urls) {\n        for (const url of urls) {\n            const response = await fetch(url);\n            const scriptText = await response.text();\n            eval(scriptText);\n        }\n    }\n    downloadAndExecuteJS(window.domloadstart_taolivejscriptarray);\n})();", c(), b()) : "";
    }
}
