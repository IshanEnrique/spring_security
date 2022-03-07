package com.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="login_details")
public class Login_Details
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private long userId;
	public long getuser_id()
	{
		return this.userId;
	}
	public void setuser_id(long value)
	{
		this.userId = value;
	}
	@Column(name="user_name")
	private String userName;
	public String getuser_name()
	{
		return this.userName;
	}
	public void setuser_name(String value)
	{
		this.userName = value;
	}

	@Column(name="password")
	private String _password;
	public String getpassword()
	{
		return this._password;
	}
	public void setpassword(String value)
	{
		this._password = value;
	}

	@Column(name="mob_pass")
	private String _mob_pass;
	public String getmob_pass()
	{
		return this._mob_pass;
	}
	public void setmob_pass(String value)
	{
		this._mob_pass = value;
	}

	@Column(name="login_status")
	private String _login_status;
	public String getlogin_status()
	{
		return this._login_status;
	}
	public void setlogin_status(String value)
	{
		this._login_status = value;
	}

//	@Column(name="BookStatus")
//	private String _Book_Status;
//
//	public String get_Book_Status() {
//		return _Book_Status;
//	}
//	public void set_Book_Status(String _Book_Status) {
//		this._Book_Status = _Book_Status;
//	}
	@Column(name="flag")
	private String _flag;
	public String getflag()
	{
		return this._flag;
	}
	public void setflag(String value)
	{
		this._flag = value;
	}

	@Column(name="user_type")
	private String _user_type;
	public String getuser_type()
	{
		return this._user_type;
	}
	public void setuser_type(String value)
	{
		this._user_type = value;
	}

	
	@Column(name="login_datetime")
	private java.sql.Date _login_datetime;
	public java.sql.Date getlogin_datetime()
	{
		return this._login_datetime;
	}
	public void setlogin_datetime(java.sql.Date value)
	{
		this._login_datetime = value;
	}

	@Column(name="current_status")
	private String _current_status;
	public String getcurrent_status()
	{
		return this._current_status;
	}
	public void setcurrent_status(String value)
	{
		this._current_status = value;
	}

	@Column(name="pass_status")
	private String _pass_status;
	public String getpass_status()
	{
		return this._pass_status;
	}
	public void setpass_status(String value)
	{
		this._pass_status = value;
	}

	@Column(name="old_pass")
	private String _old_pass;
	public String getold_pass()
	{
		return this._old_pass;
	}
	public void setold_pass(String value)
	{
		this._old_pass = value;
	}

	@Column(name="varify_code")
	private String _varify_code;
	public String getvarify_code()
	{
		return this._varify_code;
	}
	public void setvarify_code(String value)
	{
		this._varify_code = value;
	}

	@Column(name="Verified")
	private String _Verified;
	public String getVerified()
	{
		return this._Verified;
	}
	public void setVerified(String value)
	{
		this._Verified = value;
	}

	@Column(name="Mob_Verify_Code")
	private String _Mob_Verify_Code;
	public String getMob_Verify_Code()
	{
		return this._Mob_Verify_Code;
	}
	public void setMob_Verify_Code(String value)
	{
		this._Mob_Verify_Code = value;
	}

	@Column(name="Mob_verify_status")
	private String _Mob_verify_status;
	public String getMob_verify_status()
	{
		return this._Mob_verify_status;
	}
	public void setMob_verify_status(String value)
	{
		this._Mob_verify_status = value;
	}

	@Column(name="Profile_Status")
	private String _Profile_Status;
	public String getProfile_Status()
	{
		return this._Profile_Status;
	}
	public void setProfile_Status(String value)
	{
		this._Profile_Status = value;
	}

	@Column(name="dist_Agency_name")
	private String _dist_Agency_name;
	public String getdist_Agency_name()
	{
		return this._dist_Agency_name;
	}
	public void setdist_Agency_name(String value)
	{
		this._dist_Agency_name = value;
	}

	@Column(name="Client_Type")
	private String _Client_Type;
	public String getClient_Type()
	{
		return this._Client_Type;
	}
	public void setClient_Type(String value)
	{
		this._Client_Type = value;
	}

	@Column(name="session_flag")
	private String _session_flag;
	public String getsession_flag()
	{
		return this._session_flag;
	}
	public void setsession_flag(String value)
	{
		this._session_flag = value;
	}

	@Column(name="session_id")
	private String _session_id;
	public String getsession_id()
	{
		return this._session_id;
	}
	public void setsession_id(String value)
	{
		this._session_id = value;
	}

	@Column(name="Block_status")
	private String _Block_status;
	public String getBlock_status()
	{
		return this._Block_status;
	}
	public void setBlock_status(String value)
	{
		this._Block_status = value;
	}

	@Column(name="valid_upto")
	private java.sql.Date _valid_upto;
	public java.sql.Date getvalid_upto()
	{
		return this._valid_upto;
	}
	public void setvalid_upto(java.sql.Date value)
	{
		this._valid_upto = value;
	}

	@Column(name="Agent_profile_flag")
	private String _Agent_profile_flag;
	public String getAgent_profile_flag()
	{
		return this._Agent_profile_flag;
	}
	public void setAgent_profile_flag(String value)
	{
		this._Agent_profile_flag = value;
	}

	@Column(name="OT_password")
	private String _OT_password;
	public String getOT_password()
	{
		return this._OT_password;
	}
	public void setOT_password(String value)
	{
		this._OT_password = value;
	}

	@Column(name="OTP_Date")
	private java.sql.Date _OTP_Date;
	public java.sql.Date getOTP_Date()
	{
		return this._OTP_Date;
	}
	public void setOTP_Date(java.sql.Date value)
	{
		this._OTP_Date = value;
	}

	@Column(name="OTP_validity_time")
	private String _OTP_validity_time;
	public String getOTP_validity_time()
	{
		return this._OTP_validity_time;
	}
	public void setOTP_validity_time(String value)
	{
		this._OTP_validity_time = value;
	}

	@Column(name="Agent_Auth_Key")
	private String _Agent_Auth_Key;
	public String getAgent_Auth_Key()
	{
		return this._Agent_Auth_Key;
	}
	public void setAgent_Auth_Key(String value)
	{
		this._Agent_Auth_Key = value;
	}

	@Column(name="IP_Address")
	private String _IP_Address;
	public String getIP_Address()
	{
		return this._IP_Address;
	}
	public void setIP_Address(String value)
	{
		this._IP_Address = value;
	}


	public Login_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login_Details(long user_id_,String user_name_,String password_,String mob_pass_,String login_status_,
//			String BookStatus_,
			String flag_,String user_type_,java.sql.Date login_datetime_,String current_status_,String pass_status_,String old_pass_,String varify_code_,String Verified_,String Mob_Verify_Code_,String Mob_verify_status_,String Profile_Status_,String dist_Agency_name_,String Client_Type_,String session_flag_,String session_id_,String Block_status_,java.sql.Date valid_upto_,String Agent_profile_flag_,String OT_password_,java.sql.Date OTP_Date_,String OTP_validity_time_,String Agent_Auth_Key_,String IP_Address_)
	{
		this.userId = user_id_;
		this.userName = user_name_;
		this._password = password_;
		this._mob_pass = mob_pass_;
		this._login_status = login_status_;
//		this._Book_Status = BookStatus_;
		this._flag = flag_;
		this._user_type = user_type_;
		this._login_datetime = login_datetime_;
		this._current_status = current_status_;
		this._pass_status = pass_status_;
		this._old_pass = old_pass_;
		this._varify_code = varify_code_;
		this._Verified = Verified_;
		this._Mob_Verify_Code = Mob_Verify_Code_;
		this._Mob_verify_status = Mob_verify_status_;
		this._Profile_Status = Profile_Status_;
		this._dist_Agency_name = dist_Agency_name_;
		this._Client_Type = Client_Type_;
		this._session_flag = session_flag_;
		this._session_id = session_id_;
		this._Block_status = Block_status_;
		this._valid_upto = valid_upto_;
		this._Agent_profile_flag = Agent_profile_flag_;
		this._OT_password = OT_password_;
		this._OTP_Date = OTP_Date_;
		this._OTP_validity_time = OTP_validity_time_;
		this._Agent_Auth_Key = Agent_Auth_Key_;
		this._IP_Address = IP_Address_;
	}
}