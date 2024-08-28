#!/usr/bin/python

import os
import subprocess
import sys
import logging
import time
from verify_selinux import check_sestatus
from verify_firewall import check_firewall
from verify_umask import check_umask
from verify_cipher import check_cipher
from verify_password_policy import check_password_complexity
from verify_password_age import check_password_aging
from verify_autologout import check_autologout
from verify_listing_rpms import check_listing_rpms
from cron_log_audit import cron_log_cmp
from grace_time_audit import grace_cmp
from history_logging_audit import hist_cmp
from restrict_at_audit import at_restrict_cmp
from verify_tcp_wrappers import tcp_cmp
from restrict_cron_audit import cron_restrict_cmp
from verify_ntp import ntp_cmp
from verify_pf_logs import check_performance_logs
from verify_ssh_login import check_ssh_login
from verify_mask import ctrl_alt_del
from verify_icmp_config import icmp_check
from verify_ssh_v2 import ssh_protocol_check
from verify_static_ip import dhcp_staticip_check
from verify_suid import root_suid_check
from verify_icmp import check_icmp
from verify_motd_banner import check_motd_banner
from verify_reverse_fwd import check_reverse_fwd
from verify_SR import check_SR_status
from verify_sshd_banner import check_banner
from verify_agent_fwdng import check_sshd_config
from verify_sticky_bit import check_sticky_bit
sys.path.insert(0, '/ericsson/security/audit')
import NH_audit
from NH_audit import audit

def main():



    status_rpm_file=check_listing_rpms()
    print(status_rpm_file)
if __name__=='__main__':
        main()


