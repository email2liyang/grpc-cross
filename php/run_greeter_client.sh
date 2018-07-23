set -e
cd $(dirname $0)
php -d max_execution_time=300 greeter_client.php $1
