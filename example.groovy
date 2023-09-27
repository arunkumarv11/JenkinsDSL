job('Service-Check') {

description ('This job checks some services')
  scm
 {
    git("https://github.com/arunkumarv11/JenkinsDSL.git", Master)
 }
  triggers
 {
   scm("* * * * *")
 }
  steps
 {
    shell('date','sudo systemctl status firewalld.service')
  }
}
