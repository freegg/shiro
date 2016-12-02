var messages={
		"M-001":"取消をすると回復できないので、「取消」を確定しますか？",
		"M-002":"您的《XXXXX 申请书》已经提交成功。审批进度及结果可以在[我的申请]页确认，请留意审批结果。温馨关怀...",
		"M-003":"申請理由は5文字以上の記入が必要です。",
		"M-004":"まだ埋めてない項目があるらしいので、ご確認して再試してください。",
		"M-005":"稼働計画の変更には公休と出勤₍或出張₎のペアで提出する必要があるので（公休 ⇄ 出勤/出張）。",
		"M-006":"該当するデータがありません",
		"M-007":"添付ファイルが必須記入項目ですので、アップして再試してください。",
		"M-008":"該当するデータがありません",
		"M-009":"該当するデータがありません",
		"M-010":"該当するデータがありません",
		"M-011":"是否催促审批人进行审批？",
		"M-012":"未找到符合条件的数据",
		"M-013":"提出には成功でした。",
		"M-014":"请确认您所填的模式信息再提交",
		"M-015":"未找到符合条件的数据",
		"M-016":"请选择查询条件",
		"M-017":"本申请仅限男性员工，此「申请者」没有本申请的申请资格。",
		"M-018":"加班/振替出勤的最小申请单位为 30 分钟，请修改后再提出。",
		"M-019":"权限更改成功",
		"M-020":"有未填写的项目，请填写后提出。",
		"M-021":"提交失败。",
		"M-022":"対象日には承認待ちの案件があるので、新しい申請が提出できません。",
		"M-023":"本申请仅限女性员工，此「申请者」没有本申请的申请资格。",
		"M-024":"  対象日は有効日付ではありません；ご子供が生まれてから1年間内申請可能です。",
		"M-025":"   対象日は有効日付ではありません；ご子供が生まれてから6ヵ月内申請可能です。",
		"M-026":"「陪護暇」は最大7日間が申請可能です",
		"M-027":"输入时间以15分钟为单位计，请核查时间!",
		"M-028":"日付の入力が不正です；ご確認し再試してください。",
		"M-029":"原退勤時間",
		"M-030":"请输入您与逝者的关系",
		"M-031":"申請日数はオーバーです；1日間以内申請可能です。",
		"M-032":"申請日数はオーバーです；3日間以内申請可能です。",
		"M-033":"邮件发送成功",
		"M-034":"取消には成功でした。",
		"M-036":"却下理由は5文字以上の記入が必要です。",
		}

$.extend({
	alert:function(msg_id){
		var text = msg_id;
		if (messages[msg_id]!=undefined) {
			text = messages[msg_id];
		}

		$.MessageBox({
			content: text,
			type: 'information',
			animate: { open : 'top', close : 'top', speed : '500' },
			buttons: { confirm: {title: '确定', style: 'continue'} },
			usekey: true ,
			timeout: { second : '5', screen: true }
		});
	},
	getmsg:function(msg_id){
		var text = msg_id;
		if (messages[msg_id]!=undefined) {
			text = messages[msg_id];
		}
		return text;
	},
	confirm:function(msg_id,callback){
		var text = msg_id;
		if (messages[msg_id]!=undefined) {
			text = messages[msg_id];
		}
		$.MessageBox({
			content: text,
			type: 'confirmation',
			animate: { open : 'top', close : 'top', speed : '500' },
			buttons: { confirm: {title: '继续', style: 'continue'},cancel: {title:'取消', style : 'cancel'} },
			usekey: true //,
			//timeout: { second : '5', screen: true }
		},function(response) {
			if(response){callback();}
		});
	}
});